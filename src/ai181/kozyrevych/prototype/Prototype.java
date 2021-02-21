package ai181.kozyrevych.prototype;

public class Prototype implements MyCloneable {
    private int field1;
    private int field2;

    public Prototype(int field1, int field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public int getField1() {
        return field1;
    }

    public void setField1(int field1) {
        this.field1 = field1;
    }

    public int getField2() {
        return field2;
    }

    public void setField2(int field2) {
        this.field2 = field2;
    }

    @Override
    public MyCloneable myClone() {
        return new Prototype(this.field1, this.field2);
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "field1=" + field1 +
                ", field2=" + field2 +
                '}';
    }
}
