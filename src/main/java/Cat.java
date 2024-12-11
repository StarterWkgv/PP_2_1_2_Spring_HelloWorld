public class Cat {
    private String name;
    private int age;
    private String colour;

    public Cat() {
    }

    public Cat(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;

        if (getAge() != cat.getAge()) return false;
        if (getName() != null ? !getName().equals(cat.getName()) : cat.getName() != null) return false;
        return getColour() != null ? getColour().equals(cat.getColour()) : cat.getColour() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getAge();
        result = 31 * result + (getColour() != null ? getColour().hashCode() : 0);
        return result;
    }
}
