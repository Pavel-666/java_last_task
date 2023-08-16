import java.util.HashSet;
import java.util.Set;

public class Laptops {
        private  String processor;
        private  int ram;
        private  String manufacturer;
        private  String operatingSystem;
        private  int hdd;
        private  String nameVideoCart;
        private  Double screenDiagonal;

        public Laptops (String processor, int ram, String manufacturer, String operatingSystem, int hdd, String nameVideoCart, Double screenDiagonal){
            this.processor = processor;
            this.ram = ram;
            this.manufacturer = manufacturer;
            this.operatingSystem = operatingSystem;
            this.hdd = hdd;
            this.nameVideoCart = nameVideoCart;
            this.screenDiagonal = screenDiagonal;
        }


    public int getRam() {
        return ram;
    }

    public  int getHdd() {
        return hdd;
    }

    public String getProcessor() {
        return processor;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getNameVideoCart() {
        return nameVideoCart;
    }

    public Double getScreenDiagonal() {
        return screenDiagonal;
    }


    @Override
        public String toString() {
            return " производитель : " + manufacturer + " процессор : " + processor + " обьем оперативной памяти : " + ram + " обьем постоянной помяти : " + hdd + "видеокарта : " + nameVideoCart + " операционная система : " + operatingSystem + " диагональ экрана : " + screenDiagonal + "\n";
        }

        @Override
        public boolean equals(Object obj) {
            if(this == obj) return true;
            if(!(obj instanceof Laptops)) return false;
            Laptops cat = (Laptops) obj;
            return processor.equals(cat.processor) && ram == cat.ram && manufacturer.equals(cat.manufacturer) && operatingSystem.equals(cat.operatingSystem) && hdd == cat.hdd && nameVideoCart.equals(cat.nameVideoCart) && screenDiagonal == cat.screenDiagonal;
        }

        @Override
        public int hashCode() {
            return 17 * processor.hashCode() + 11 * manufacturer.hashCode() + 6 * operatingSystem.hashCode() + 4 * nameVideoCart.hashCode() + (int)(screenDiagonal * 10) + 3 * ram + 4 * hdd ;
        }
    }


