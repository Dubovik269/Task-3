package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // определяет класс как компонент, чтоб спринг созд. его экземпляр и управл. как бином
public class AnimalsCage {

    @Autowired //для автоматического связывания зависимостей
    @Qualifier("dog") // указывает имя бина, который должен быть связан
    private Animal animal;

    @Autowired
    private Timer timer;
    public Timer getTimer() {
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }
}
