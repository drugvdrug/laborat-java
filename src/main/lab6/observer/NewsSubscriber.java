package main.lab6.observer;

public class NewsSubscriber implements Subscriber {
    private String name;

    public NewsSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String article) {
        System.out.println(name + " получил уведомление о новой статье: " + article);
    }
}
