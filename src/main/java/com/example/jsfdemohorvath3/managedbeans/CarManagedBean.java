package com.example.jsfdemohorvath3.managedbeans;

import com.example.jsfdemohorvath3.entity.Car;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ApplicationScoped
public class CarManagedBean {

    private List<Car> carList;
    private Car selectedCar;
    private long id;
    private List<String> colorList;
    private List<Integer> doorOptions;

    public CarManagedBean() {
        carList = new ArrayList<>();
        selectedCar = new Car();
        this.id = 0;
        colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Green");
        colorList.add("Yellow");
        doorOptions = new ArrayList<>();
        doorOptions.add(2);
        doorOptions.add(3);
        doorOptions.add(4);
        doorOptions.add(5);
    }

    @PostConstruct
    public void init() {
        for (int i = 0; i < 5; i++) {
            Car car = new Car();
            car.setBrand("Volvo" + (i+1));
            car.setDoors(4);
            car.setEngineType("Petrol");
            car.setModel("V90");
            car.setColour("Red");
            car.setId(idService());
            car.setEngineCode("VOL-123456");
            car.setTopSpeed(250);
            car.setHorsepower(360);
            carList.add(car);
        }
    }

    public void save(Car car) {
        if (car.getId() == 0) {
            car.setId(idService());
            carList.add(car);
            selectedCar = new Car();
        }
        else{
            delete(car.getId());
            carList.add(car);
            selectedCar = new Car();
        }
    }

    public void delete(long id) {
        for (Car car : carList) {
            if (car.getId() == id) {
                carList.remove(car);
                break;
            }
        }
    }

    public void findCar(long id) {
        for (Car car : carList) {
            if (car.getId() == id) {
                selectedCar = car;
            }
        }
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public Car getSelectedCar() {
        return selectedCar;
    }

    public void setSelectedCar(Car selectedCar) {
        this.selectedCar = selectedCar;
    }

    private long idService(){
        this.id++;
        return id;
    }

    public List<String> getColorList() {
        return colorList;
    }

    public void setColorList(List<String> colorList) {
        this.colorList = colorList;
    }

    public List<Integer> getDoorOptions() {
        return doorOptions;
    }

    public void setDoorOptions(List<Integer> doorOptions) {
        this.doorOptions = doorOptions;
    }
}
