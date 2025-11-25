void main() {
    population devang = new population(22,"Devang",200000000,false);
    IO.println(devang.people);
    population disha = new population(20,"disha",200000000,false);
    IO.println(disha.people);
}

class population{
    private int age;
    private String name;
    private int salary;
    private boolean married;
    long people;

    population(int age, String name, int salary, boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        people+=1;
    }
}