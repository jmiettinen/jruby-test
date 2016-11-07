package fi.relex;

class BrokenClassImpl extends BrokenClass {

    private long value;

    @Override
    public long getValue() {
        return value;
    }

    @Override
    public BrokenClass setValue(long val) {
        this.value = val;
        return this;
    }
}
