package MainLesson.Lesson13.Homework13;

import MentorLesson.Lesson4.Student;

public class HashCode {
    private String type;
    private String usefulLife;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsefulLife() {
        return usefulLife;
    }

    public void setUsefulLife(String usefulLife) {
        this.usefulLife = usefulLife;
    }


    @Override
    public String toString() {
        return "HashCode{" + "type='" + getType() + ", usefulLife=" + getUsefulLife() + "}";
    }

    @Override
    public boolean equals(Object object) {
        //reflexive
        // symmetric
        // transitive
        // consistent

        if (object == this) {
            return true;
        }
        if (!(object instanceof HashCode)) {
            return false;
        }
        HashCode hashCode = (HashCode) object;

        return (this.type == null && hashCode.type == null && this.usefulLife == null && hashCode.usefulLife == null)
                || this.type.equals(hashCode.getType()) && this.usefulLife.equals(hashCode.getUsefulLife());


    }

    @Override
    public final int hashCode() {
        //internal
        //equals
        //collision
        int result = 17;
        if (type != null) {
            result = 31 * result + type.hashCode();
        }
        if (usefulLife != null) {
            result = 31 * result + usefulLife.hashCode();
        }
        return result;
    }


}
