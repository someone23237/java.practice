import java.util.ArrayList;

class Magic2{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(49);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        System.out.println(numbers);
        numbers.forEach((x)->{
            System.out.println(x);
        });
        numbers.forEach((x)->{
            if(x==49)
            System.out.println("found 49");

        });

    }
}
