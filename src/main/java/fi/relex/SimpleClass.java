package fi.relex;

public abstract class SimpleClass {

    public static SimpleClass getInstance() {
        return new SimpleClassImpl();
    }

    public abstract long getValue();
    public abstract SimpleClass setValue(long value);

}
