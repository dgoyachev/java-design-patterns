package pw.goryachev.dp.patterns.creational.singleton.holder;

/**
 * Created by morgan on 26.06.2020
 */

public class HolderRegistry {

        private HolderRegistry() {
            System.out.println("In LazyRegistry singleton");
        }

        private static class RegistryHolder {
            static HolderRegistry INSTANACE = new HolderRegistry();
        }

        public static HolderRegistry getInstance() {
            return RegistryHolder.INSTANACE;
        }
}
