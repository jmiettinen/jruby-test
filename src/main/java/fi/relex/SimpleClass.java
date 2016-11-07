package fi.relex;

public abstract class SimpleClass {

    public static SimpleClass getInstance() {
        return new SimpleClassImpl();
    }

    public abstract SimpleClass setValue(long value);

}
