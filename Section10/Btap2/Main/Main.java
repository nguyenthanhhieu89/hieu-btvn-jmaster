package Section10.Btap2.Main;

import Section10.Btap2.Model.Laptop;
import Section10.Btap2.Service.LaptopService;
import Section10.Btap2.Service.LaptopServiceImpl;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        LaptopService laptopService = new LaptopServiceImpl();
        laptopService.input(laptop);
        laptopService.info(laptop);

    }
}
