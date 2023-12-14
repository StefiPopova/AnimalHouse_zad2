public class Main {
    public static void main(String[] args){

                Fish fish = new Fish();
                Snake snake = new Snake();

                AnimalHouse<Fish> fishHouse = new AnimalHouse<>();
                AnimalHouse<Snake> snakeHouse = new AnimalHouse<>();
                fishHouse.animal = fish;
                snakeHouse.animal = snake;
            }
        }
