package ru.mirea.lab3.task2;

public class Human {
    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    class Head{

        private int sizeL,sizeW;

        public Head(int sizeL, int sizeW) {
            this.sizeL = sizeL;
            this.sizeW = sizeW;
        }

        public int getSizeL() {
            return sizeL;
        }

        public void setSizeL(int sizeL) {
            this.sizeL = sizeL;
        }

        public int getSizeW() {
            return sizeW;
        }

        public void setSizeW(int sizeW) {
            this.sizeW = sizeW;
        }

        @Override
        public String toString() {
            return "Head{" +
                    "sizeL=" + sizeL +
                    ", sizeW=" + sizeW +
                    '}';
        }
    }
    class Leg{
        private int lengthLeg, sizeFoot;

        public Leg(int lengthLeg, int sizeFoot) {
            this.lengthLeg = lengthLeg;
            this.sizeFoot = sizeFoot;
        }

        public int getLengthLeg() {
            return lengthLeg;
        }

        public void setLengthLeg(int lengthLeg) {
            this.lengthLeg = lengthLeg;
        }

        public int getSizeFoot() {
            return sizeFoot;
        }

        public void setSizeFoot(int sizeFoot) {
            this.sizeFoot = sizeFoot;
        }

        @Override
        public String toString() {
            return "Leg{" +
                    "lengthLeg=" + lengthLeg +
                    ", sizeFoot=" + sizeFoot +
                    '}';
        }
    }
    class Hand{
        private int size;

        public Hand(int size) {
            this.size = size;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        @Override
        public String toString() {
            return "Hand{" +
                    "size=" + size +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class Main{
    public static void main(String[] args) {
        Human human = new Human(19,"Дмитрий");
        System.out.println(human);
        Human.Head head = human. new Head(20,30);
        System.out.println(head);
        Human.Leg leg = human. new Leg(10,30);
        System.out.println(leg);
        Human.Hand hand = human. new Hand(40);
        System.out.println(hand);
    }
}