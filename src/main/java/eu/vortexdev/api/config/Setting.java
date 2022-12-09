package eu.vortexdev.api.config;

public class Setting<T> {
    private final String key, comment;
    private T value;

    public Setting(String key, String comment, T value) {
        this.key = key;
        this.value = value;
        this.comment = comment;
    }

    public String getKey() {
        return key;
    }

    public String getComment() {
        return comment;
    }

    public T getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = (T) value;
    }
}
