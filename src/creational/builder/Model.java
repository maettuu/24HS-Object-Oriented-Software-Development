package creational.builder;

public class Model {
    private final String name;
    private final Gender gender;

    private final int age;
    private final int height;
    private final EyeColor eyeColor;
    private final HairColor hairColor;

    private Model(Builder builder) {
        this.name = builder.name;
        this.gender = builder.gender;
        this.height = builder.height;
        this.eyeColor = builder.eyeColor;
        this.age = builder.age;
        this.hairColor = builder.hairColor;
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + "'" +
                ", gender='" + gender + "'" +
                ", age='" + age + "'" +
                ", height='" + height + "'" +
                ", eye-color='" + eyeColor + "'" +
                ", hair-color='" + hairColor + "'" +
                "}";
    }

    public static class Builder {
        private final String name;
        private final Gender gender;

        private int age = 0;
        private int height = 0;
        private EyeColor eyeColor = EyeColor.UNKNOWN;
        private HairColor hairColor = HairColor.UNKNOWN;

        public Builder(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder height(int height) {
            this.height = height;
            return this;
        }

        public Builder eyeColor(EyeColor eyeColor) {
            this.eyeColor = eyeColor;
            return this;
        }

        public Builder hairColor(HairColor hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public Model create() {
            return new Model(this);
        }
    }
}
