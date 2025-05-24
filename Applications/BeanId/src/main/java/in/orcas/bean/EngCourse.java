package in.orcas.bean;

import java.util.Set;

public class EngCourse {
    private Set<String> subjects;

    public void setSubjects(Set<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "EngCourse [subjects=" + subjects + "]";
    }
}
