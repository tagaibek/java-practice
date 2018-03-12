package theory;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleFunction;

class Java7_8Theory {
    public interface DataSupplier<T> {
        T get();
    }

    public interface DataConsumer<T>{
        void accept(T t);
    }

    public static class Toyota {
        String model;
        int year;
        public Toyota(String model, int year) {
            this.model = model;
            this.year = year;
        }
    }

   public static class Ford{
        String model;
        int year;

        public Ford(String model, int year) {
            this.model = model;
            this.year = year;
        }
    }

    //java 7
    public static class ToyotaSupplier implements DataSupplier<Toyota>{
        @Override
        public Toyota get() {
            return new Toyota("camry", 2018);
        }
    }

    public static class FordSupplier implements DataSupplier<Ford>{
        @Override
        public Ford get() {
            return new Ford("focus", 2017);
        }
    }

    public static class ToyotaConsumer implements DataConsumer<Toyota>{

        @Override
        public void accept(Toyota toyota) {
            System.out.println("not a lambda:" + toyota.model + ":" + toyota.year);
        }
    }

    //java 8
    public static void main(String[] args) {
        DataSupplier<Toyota> camry7 = new ToyotaSupplier();
        DataSupplier<Toyota> corolla8 = () -> new Toyota("corolla", 2015);

        DataConsumer<Toyota> toyotaConsumer7 = new ToyotaConsumer();
        DataConsumer<Toyota> toyotaConsumer8 = (toyotaObj)-> System.out.println("lambda:" + toyotaObj.model + ":" + toyotaObj.year);

        Toyota toyota7 = camry7.get();
        toyotaConsumer7.accept(toyota7);

        Toyota toyota8 = corolla8.get();
        toyotaConsumer8.accept(toyota8);

        //build in java8 function package interfaces
        DoubleFunction<String> ds = (d) -> "string: " + d;
        DoubleFunction<Float> df = (d) -> {
            System.out.println("applying d=" + d);
            return new Float(d + 1.1);
        };

        System.out.println(ds.apply(3.3));
        System.out.println(ds.apply(5.5));
        System.out.println(df.apply(6.6));

        //java streams
        List<String> carModels = Arrays.asList("rav4", "prado", "benz");
        carModels.stream()
                .filter(model -> !model.equals("benz"))
                .map(model -> new Toyota(model, 2015))
                .forEach(toyota -> System.out.println("in forEach: " + toyota.model));
    }
}
