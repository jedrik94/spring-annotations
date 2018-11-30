package pl.jedrik94.demo.service;

public class ChinaFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Eat Beijing Duck every week until you became one..";
    }
}
