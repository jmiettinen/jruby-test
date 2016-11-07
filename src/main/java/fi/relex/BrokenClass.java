package fi.relex;

public abstract class BrokenClass {

    public static class Builder extends BrokenClassImpl.Builder {}

    public static Builder builder() {
        return new Builder();
    }

    public abstract long getValue();

    public String toString() { return getClass().getSimpleName() + "/" + String.valueOf(getValue()); }

}
