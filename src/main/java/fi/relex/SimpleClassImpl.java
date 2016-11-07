package fi.relex;

public class SimpleClassImpl extends SimpleClass {

    private long value;

    @Override
    public long getValue() {
        return value;
    }

    @Override
    public SimpleClass setValue(long value) {
        this.value = value;
        return this;
    }
}
