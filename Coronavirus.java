public class Coronavirus {
    
    public static class Person{
        public int age;
        public String nat;
        public boolean alive;
        public boolean infected;

        public Person[] adjacent;

        public boolean isAlive(){
            return this.alive;
        }

        public boolean isInfected(){
            return this.infected;
        }
        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getNat() {
            return nat;
        }

        public void setNat(String nat) {
            this.nat = nat;
        }

        public Person(int age) {
            this.age = age;
        }
    }
    
    public Person persona;
    
    public static void infection(Person p){
        if (p.getAge() >= 60 && p.isAlive()) {
            kill(p);
        } else {
            coughCough(p);
        }
    }

    public static void spread(Person p){
        if (p.isAlive() && p.isInfected()){
            for (int i = 0; i < p.adjacent.length; i++) {
                infection(p.adjacent[i]);
            }
        }
    }

    //TODO coughCough(Persona p)
    // TODO kill(Persona p)
}
