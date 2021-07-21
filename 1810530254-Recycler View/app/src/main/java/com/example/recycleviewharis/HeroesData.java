package com.example.recycleviewharis;

import java.util.ArrayList;

public class HeroesData {
    private static String[] heroNames = {
            "Samsung Galaxy S21 Ultra",
            "Samsung Galaxy S21+",
            "Samsung Galaxy S21",
            "Samsung Galaxy Note20 Ultra",
            "Samsung Galaxy S20 Ultra",
            "Samsung Galaxy Note20",
            "Samsung Galaxy Z Fold2",
            "Samsung Galaxy S20+",
            "Samsung Galaxy S20",
            "Samsung Galaxy S20 FE"
    };

    private static String[] heroDetails = {
            "Spesifikasi : \n" +
            "Layar : Dynamic AMOLED 2x 6.8 inci Edge QHD+\n" +
            "Prosesor : Exynos 2100 (5 nm)\n" +
            "Memori Internal : 128 GB / 256 GB / 512 GB.\n" +
            "RAM : 12 GB / 16 GB\n" +
            "Kamera : Belakang 108 MP + 10 MP + 10 MP+ 12 MP, Depan 40 MP\n" +
            "Sistem operasi : Android 11\n" +
            "Baterai : 5000 mAh\n" +
            "Samsung Galaxy S21 Ultra dengan varian 12/128GB 5G diberi harga Rp 16.999.000\n" ,
            "Spesifikasi : \n" +
            "Layar : 6.7 inci, 1080 x 2400 piksel, 20:9 ratio\n" +
            "Chipset : Exynos 2100 (5 nm)\n" +
            "GPU : Mali-G78 MP14\n" +
            "RAM : 8 GB, 12 GB\n" +
            "OS : Android 11, One UI 3.1\n" +
            "Kamera utama : 12 MP, + 64 MP, + 12 MP\n" +
            "Baterai : 4.800 mAh\n" +
            "Internal Memori : 128 GB, 256 GB\n" +
            "Samsung Galaxy S21 Plus dengan varian 8/256GB 5G diberi harga Rp 15.499.000\n" ,
            "Spesifikasi : \n"+
            "Layar : 6.2-inch Flat FHD+ , Dynamic AMOLED 2x \n" +
            "Ram : 8GB, 12GB\n"    +
            "Kamera depan : 10MP Dual Pixel AF\n" +
            "Kamera belakang : Triple Kamera, Ultra Wide, Wide Angle, & Telephoto\n" +
            "Prosesor : Exynos 2100 (5 nm)\n" +
            "Memori : 8GB RAM (LPDDR5) with 128GB / 256GB internal storage\n" +
            "Baterai : 4000 mAh\n" +
            "Os  : Android 11\n" +
            "Harga : Mulai dari Rp 12.999.000\n" ,
            "Spesifikasi : \n" +
            "Layar : 6.9 inches Quad HD+ 1440 x 3088 pixels, Dynamic AMOLED 2X\n" +
            "Ram : 8GB\n" +
            "Kamera depan : 10MP\n" +
            "Kamera belakang : 108MP + 12MP + 12MP\n" +
            "Prosesor : Samsung Exynos 990 (7 nm+) - Global\n" +
            "Memori : 256GB , 512GB\n" +
            "Baterai : 4500 mAh\n" +
            "Os : Android 10, One UI 2.5\n" +
            "Harga : Mulai dari Rp 13.999.000\n",
            "Spesifikasi : \n" +
            "Layar : 6.9 inches, Dynamic AMOLED 2X, 120Hz, HDR10+\n" +
            "Ram : 12GB dan 16GB\n" +
            "Kamera depan : 40MP\n" +
            "Kamera belakang : 108MP + 48MP + 12MP\n" +
            "Prosesor : Samsung Exynos 990 (7 nm+) - Global\n" +
            "Memori : 128GB, 256GB , 512GB\n" +
            "Baterai : 5000 mAh\n" +
            "Os : Android 10, One UI 3.0\n" +
            "Harga : Mulai dari Rp 11.700.000\n",
            "Spesifikasi : \n" +
            "Layar : 6.7 inches, Super AMOLED Plus, HDR10+\n" +
            "Ram : 8 GB\n" +
            "Kamera depan : 10MP\n" +
            "Kamera belakang : 12MP + 64MP + 12MP\n" +
            "Prosesor : Samsung Exynos 990 (7 nm+)\n" +
            "Memori : 256 GB\n" +
            "Baterai : 4300 mAh\n" +
            "Os : Android 10, One UI 3.0\n" +
            "Harga : Mulai dari Rp 10.990.000\n",
            "Spesifikasi : \n" +
            "Layar : 7.6 inches, Foldable Dynamic AMOLED 2X, 120Hz, HDR10+\n" +
            "Ram : 12 GB\n" +
            "Kamera depan : 10MP + 10MP\n" +
            "Kamera belakang : 12MP + 12MP + 12MP\n" +
            "Prosesor : Qualcomm SM8250 Snapdragon 865 5G+ (7 nm+)\n" +
            "Memori : 256GB, 512GB\n" +
            "Baterai : 4500 mAh\n" +
            "Os : Android 10, One UI 3.1\n" +
            "Harga : Mulai dari Rp 24.990.000\n",
            "Spesifikasi : \n" +
            "Layar : 6.7 inches, Dynamic AMOLED 2X, 120Hz, HDR10+\n" +
            "Ram : 8 GB\n" +
            "Kamera depan : 10MP\n" +
            "Kamera belakang : 12MP + 64MP + 12MP\n" +
            "Prosesor : Exynos 990 (7 nm+) - Global\n" +
            "Memori : 128GB\n" +
            "Baterai : 4500 mAh\n" +
            "Os : Android 10, One UI 3.0\n" +
            "Harga : Mulai dari Rp 24.990.000\n",
            "Spesifikasi : \n" +
            "Layar : 6.2 inches, Dynamic AMOLED 2X, 120Hz, HDR10+\n" +
            "Ram : 8 GB\n" +
            "Kamera depan : 10MP\n" +
            "Kamera belakang : 12MP + 64MP + 12MP\n" +
            "Prosesor : Exynos 990 (7 nm+) - Global\n" +
            "Memori : 128GB\n" +
            "Baterai : 4000 mAh\n" +
            "Os : Android 10, One UI 3.0\n" +
            "Harga : Mulai dari Rp 9.499.000\n",
            "Spesifikasi : \n" +
            "Layar : 6.5 inches, SUPER AMOLED, 120Hz, HDR10+\n" +
            "Ram : 6GB, 8 GB\n" +
            "Kamera depan : 32MP\n" +
            "Kamera belakang : 12MP + 8MP + 12MP\n" +
            "Prosesor : Exynos 990 (7 nm+) - Global\n" +
            "Memori : 128GB, 256GB\n" +
            "Baterai : 4500 mAh\n" +
            "Os : Android 10, One UI 3.0\n" +
            "Harga : Mulai dari Rp 8.999.000\n"
    };

    private static int[] heroesImages = {
            R.drawable.galaxysduasatu_ultra,
            R.drawable.galaxysduasatu_plus,
            R.drawable.galaxysduasatu_biasa,
            R.drawable.noteduapuluh_ultra,
            R.drawable.galaxysduapuluh_ultra,
            R.drawable.galaxynote_duapuluh,
            R.drawable.galaxyzfold_dua,
            R.drawable.galaxysduapuluh_plus,
            R.drawable.galaxys_duapuluh,
            R.drawable.galaxysduapuluh_fe
    };

    static ArrayList<Hero> getListData() {
        ArrayList<Hero> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++) {
            Hero hero = new Hero();
            hero.setName(heroNames[position]);
            hero.setDetail(heroDetails[position]);
            hero.setPhoto(heroesImages[position]);
            list.add(hero);
        }
        return list;
    }
}

