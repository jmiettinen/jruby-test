package fi.relex;

class BrokenClassImpl extends BrokenClass {

    private final long value;
    BrokenClassImpl(long value) {
        this.value = value;
    }

    @Override
    public long getValue() {
        return value;
    }

    static class Builder {

        private long value;

        public Builder setValue(long value) {
            this.value = value;
            return this;
        }

        public BrokenClassImpl build() {
            return new BrokenClassImpl(value);
        }

    }
}
