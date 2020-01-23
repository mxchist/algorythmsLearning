import java.util.NoSuchElementException;

class MyTreeMap<Key extends Comparable<Key>, Value> {
    private Node root;

    private class Node {
        Key key;
        Value value;
        Node left;
        Node right;
        int size;
        int level;

        public Node(Key key, Value value) {
            this.key = key;
            this.value = value;
            this.size = 1;
        }
    }

    public int size() {
        return size(root);
    }

    private int size(Node node) {
        if (node == null) {
            return 0;
        }
        return node.size;
    }

    public boolean isEmpty() {
        return root == null;
    }

    private boolean isKeyNotNull(Key key) {
        if (key == null) {
            throw new IllegalArgumentException("key не должен быть null");
        }
        return true;
    }

    public final boolean contains(Key key) {
        return get(key) != null;
    }

    public final Value get(Key key) {
        isKeyNotNull(key);
        return get(root, key);
    }

    private Value get(Node node, Key key) {
        if (node == null) {
            return null;
        }
        int cmp = key.compareTo(node.key);
        if (cmp == 0) {
            return node.value;
        } else if (cmp < 0) {
            return get(node.left, key);
        } else {
            return get(node.right, key);
        }
    }

    public final void put(Key key, Value value) {
        isKeyNotNull(key);
        if (value == null) {

            return;
        }
        root = put(root, key, value);
    }

    private Node put(Node node, Key key, Value value) {
        if (node == null) {
            return new Node(key, value);
        }
        int cmp = key.compareTo(node.key);
        if (cmp == 0) {
            node.value = value;
        } else if (cmp < 0) {
            node.left = put(node.left, key, value);
            node.left.level = node.level + 1;
        } else {
            node.right = put(node.right, key, value);
            node.right.level = node.level + 1;
        }
        node.size = size(node.left) + size(node.right) + 1;
        return node;
    }

    public Key minKey() {
        return min(root).key;
    }

    private Node min(Node node) {
        if (node.left == null) {
            return node;
        }
        return min(node.left);
    }

    private Node max(Node node) {
        if (node.right == null) {
            return node;
        }
        return max(node.right);
    }

    public void deleteMin() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        root = deleteMin(root);
    }

    private Node deleteMin(Node node) {
        if (node.left == null) {
            return node.right;
        }
        node.left = deleteMin(node.left);
        node.size = size(node.left) + size(node.right) + 1;
        return node;
    }

    public final void delete(Key key) {
        isKeyNotNull(key);
        root = delete(root, key);
    }

    private Node delete(Node node, Key key) {
        if (node == null) {
            return null;
        }
        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            node.left = delete(node.left, key);
        } else if (cmp > 0) {
            node.right = delete(node.right, key);
        } else {
            if (node.left == null) {
                return node.right;
            }
            if (node.right == null) {
                return node.left;
            }
            Node tmp = node;
            node = min(node.right);
            node.right = deleteMin(tmp.right);
            node.left = tmp.left;
        }
        node.size = size(node.left) + size(node.right) + 1;
        return node;
    }

    @Override
    public String toString() {
        return toString(root);
    }

    private String toString(Node node) {
        if(node == null){
            return "";
        }
        return toString(node.left)
                + "[" + node.key + "=" + node.value + "], "
                + toString(node.right);
    }

    public int getLevel() {
        return getLevel(root);
    }

    public int getLevel(Node node) {
        int leftLevel = 0, rightLevel = 0;
        if (node.left != null) {
            leftLevel = getLevel(node.left);
        }
        if (node.right != null) {
            rightLevel = getLevel(node.right);
        }
        return (leftLevel < rightLevel ? rightLevel : leftLevel) + 1;
    }

    public boolean isBalanced() {
        if (root.right == null || root.left == null) {
            if (root.right != null) return getLevel(root.right) <= 1;
            if (root.left != null) return getLevel(root.left) <= 1;
            return false;
        }
        int leftLevel = getLevel(root.left);
        int rightLevel = getLevel(root.right);

        return leftLevel - rightLevel <= 1 && leftLevel - rightLevel >= -1;
    }
}
