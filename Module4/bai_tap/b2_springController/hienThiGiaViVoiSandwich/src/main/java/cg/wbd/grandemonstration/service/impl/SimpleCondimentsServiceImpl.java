package cg.wbd.grandemonstration.service.impl;

import cg.wbd.grandemonstration.model.Condiments;
import cg.wbd.grandemonstration.service.CondimentsService;
import org.springframework.lang.NonNull;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class SimpleCondimentsServiceImpl implements CondimentsService {
    private static List<Condiments> condiments;
    private static long autoIncreaseId = 0;

    static {
        condiments = asList(
                new Condiments(autoIncreaseId++, "T", "t@codegym.vn", "Da Nang", ""),
                new Condiments(autoIncreaseId++, "Nhat", "nhat@codegym.vn", "Quang Tri",""),
                new Condiments(autoIncreaseId++, "Trang", "trang@codegym.vn", "Ha Noi",""),
                new Condiments(autoIncreaseId++, "Nguyen Binh Son", "son@codegym.vn", "Sai Gon",""),
                new Condiments(autoIncreaseId++, "Dang Xuan Hoa", "hoa.dang@codegym.vn", "Da Nang","")
        );
    }

    @Override
    public List<Condiments> findAll() {
        return new ArrayList<>(condiments);
    }

    @Override
    public Condiments findOne(Long id) {
        return condiments.stream()
                .filter(c -> c.getLettuce().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Condiments save(Condiments condiments) {
        return condiments.getId() == null ? persist(condiments) : merge(condiments);
    }

    @Override
    public List<Condiments> save(List<Condiments> condiments) {
        return condiments.stream()
                .map(this::save)
                .collect(Collectors.toList());
    }

    @Override
    public boolean exists(Long id) {
        return condiments.stream().anyMatch(c -> c.getId().equals(id));
    }

    @Override
    public List<Condiments> findAll(List<Long> ids) {
        return ids.stream()
                .map(this::findOne)
                .collect(Collectors.toList());
    }

    @Override
    public long count() {
        return condiments.size();
    }

    @Override
    public void delete(Long id) {
        condiments.removeIf(c -> c.getId().equals(id));
    }

    @Override
    public void delete(Condiments customer) {
        delete(customer.getId());
    }

    @Override
    public void delete(List<Condiments> customers) {
        customers.forEach(this::delete);
    }

    @Override
    public void deleteAll() {
        condiments = new ArrayList<>();
    }

    private Condiments persist(Condiments customer) {
        Condiments clone = customer.clone();
        clone.setId(autoIncreaseId++);
        condiments.add(clone);
        return clone;
    }

    private Condiments merge(Condiments condiments) {
        Condiments origin = findOne(condiments.getId());
        origin.setLettuce(condiments.getLettuce());
        origin.setTomato(condiments.getTomato());
        origin.setMustand(condiments.getMustand());
        origin.setSprout(condiments.getSprout());
        return origin;
    }
}
