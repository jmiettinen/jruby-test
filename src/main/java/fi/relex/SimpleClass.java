package fi.relex;

public abstract class SimpleClass {

    public static class Builder extends SimpleClassImpl.Builder {}

    public static Builder builder() { return new Builder(); }

    public abstract long getValue();

    public String toString() { return getClass().getSimpleName() + "/" + String.valueOf(getValue()); }

}
