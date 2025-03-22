package com.oops.java_association;

//Association :- Relationship between objects.
// one-to-one
// one-to-many
// many-to-many
// many-to-one
public class JavaAssociation {
    void oneToOneRelationship() {
        PrimeMinister pm = new PrimeMinister();
        Country cy = new Country(pm);
        cy.details();
    }

    void oneToManyRelationship() {
        PrimeMinister pm = new PrimeMinister();
        Minister m = new Minister("Finance Minister");
        Minister m2 = new Minister("Food Minister");
        Minister m3 = new Minister("Eduction Minister");
        Minister m4 = new Minister("Transport Minister");
        pm.addMinister(m);
        pm.addMinister(m2);
        pm.addMinister(m3);
        pm.addMinister(m4);
        System.out.println("Prime minister can have many minister [ one to many ]");
        pm.showAllMinister();
    }

    void manyToOneRelationship() {
        MembersOfParliament mp = new MembersOfParliament("Finance Minister");
        MembersOfParliament mp2 = new MembersOfParliament("Food Minister");
        MembersOfParliament mp3 = new MembersOfParliament("Eduction Minister");
        MembersOfParliament mp4 = new MembersOfParliament("Transport Minister");
        PrimeMinister pm = new PrimeMinister();
        pm.addMemberOfParliament(mp);
        pm.addMemberOfParliament(mp2);
        pm.addMemberOfParliament(mp3);
        pm.addMemberOfParliament(mp4);
        pm.showAllMemberOfParliament();
    }

    void manyToManyRelationship() {
        Student s = new Student("Name 2");
        Student s2 = new Student("Name 2");
        Student s3 = new Student("Name 2");
        Student s4 = new Student("Name 2");

        Course c = new Course("English");
        Course c2 = new Course("Hindi");
        Course c3 = new Course("Maths");
        Course c4 = new Course("Science");

        c.addStudents(s);
        c2.addStudents(s2);
        c3.addStudents(s3);
        c4.addStudents(s4);

        s.addCourses(c4);
        s2.addCourses(c3);
        s3.addCourses(c2);
        s4.addCourses(c);

        System.out.println("Student can have many courses and course can have many students [ many to many ]");

        c.showAllstudent();
        s2.showAllCourses();
    }

    public static void main(String[] args) {
        JavaAssociation ja = new JavaAssociation();
        ja.oneToOneRelationship();
        ja.oneToManyRelationship();
        ja.manyToOneRelationship();
        ja.manyToManyRelationship();
    }
}
