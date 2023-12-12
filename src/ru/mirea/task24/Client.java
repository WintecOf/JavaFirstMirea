package ru.mirea.task24;

public class Client {
    public Chair chair;
    public void sit() {
        chair.changeSeat();
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }


}
