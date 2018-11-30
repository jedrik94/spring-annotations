package pl.jedrik94.demo.service;

public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Do not look behind you? Please, do not!";
    }
}
