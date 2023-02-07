package org.adrond.classes;

public enum StudyProfile {
    MEDICINE("Медицина"),
    MATH("Математика"),
    GEO ("География"),
    LAW("Право");

    String profileName;

    StudyProfile (String profileName) {
        this.profileName=profileName;
    }

    StudyProfile () {
            }

    @Override
    public String toString() {
        return "StudyProfile{" +
                "profileName='" + profileName + '\'' +
                '}';
    }
}
