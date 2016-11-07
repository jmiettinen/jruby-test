package fi.relex;

public class SimpleClassImpl extends SimpleClass {

    private final long value;

    public SimpleClassImpl(long value) {
        this.value = value;
    }

    @Override
    public long getValue() {
        return value;
    }

    public static class Builder {

        private long value;

        public Builder setValue(long value) {
            this.value = value;
            return this;
        }

        public SimpleClassImpl build() {
            return new SimpleClassImpl(value);
        }

    }

}
