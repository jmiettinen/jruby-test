package fi.relex;

public abstract class BrokenClass {

    public BrokenClass getBrokenInstance() {
        return new BrokenClassImpl();
    }

    public abstract long getValue();
    public abstract BrokenClass setValue(long val);

}
