package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public abstract class FakeApiServiceGenerator {


    static List<User> generateUsers() {
        return new ArrayList<>(FAKE_USERS);
    }

    public static List<User> FAKE_USERS = Arrays.asList(
            new User("001", "Jake", "https://cdn.icon-icons.com/icons2/212/PNG/256/User-red256_25014.png"),
            new User("002", "Paul", "https://cdn.icon-icons.com/icons2/212/PNG/256/User-blue256_25016.png"),
            new User("003", "Phil", "https://cdn.icon-icons.com/icons2/212/PNG/256/User-yellow256_25012.png"),
            new User("004", "Guillaume", "https://cdn.icon-icons.com/icons2/212/PNG/256/User-green256_25015.png"),
            new User("005", "Francis", "https://cdn.icon-icons.com/icons2/212/PNG/256/User-red256_25014.png"),
            new User("006", "George", "https://cdn.icon-icons.com/icons2/212/PNG/256/User-blue256_25016.png"),
            new User("007", "Louis", "https://cdn.icon-icons.com/icons2/212/PNG/256/User-yellow256_25012.png"),
            new User("008", "Mateo", "https://cdn.icon-icons.com/icons2/212/PNG/256/User-green256_25015.png"),
            new User("009", "April", "https://cdn.icon-icons.com/icons2/212/PNG/256/User-red256_25014.png"),
            new User("010", "Louise", "https://cdn.icon-icons.com/icons2/212/PNG/256/User-blue256_25016.png"),
            new User("011", "Elodie", "https://cdn.icon-icons.com/icons2/212/PNG/256/User-yellow256_25012.png"),
            new User("012", "Helene", "https://cdn.icon-icons.com/icons2/212/PNG/256/User-green256_25015.png"),
            new User("013", "Fanny", "https://cdn.icon-icons.com/icons2/212/PNG/256/User-red256_25014.png"),
            new User("014", "Laura", "https://cdn.icon-icons.com/icons2/212/PNG/256/User-blue256_25016.png"),
            new User("015", "Gertrude", "https://cdn.icon-icons.com/icons2/212/PNG/256/User-yellow256_25012.png"),
            new User("016", "Chloé", "https://cdn.icon-icons.com/icons2/212/PNG/256/User-green256_25015.png"),
            new User("017", "April", "https://cdn.icon-icons.com/icons2/212/PNG/256/User-red256_25014.png"),
            new User("018", "Marie", "https://cdn.icon-icons.com/icons2/212/PNG/256/User-blue256_25016.png"),
            new User("019", "Henri", "https://cdn.icon-icons.com/icons2/212/PNG/256/User-yellow256_25012.png"),
            new User("020", "Rémi", "https://cdn.icon-icons.com/icons2/212/PNG/256/User-green256_25015.png")
    );

    public static List<User> FAKE_USERS_RANDOM = Arrays.asList(
            new User("021", "Lea", "https://cdn.icon-icons.com/icons2/212/PNG/256/User-red256_25014.png"),
            new User("022", "Geoffrey", "https://cdn.icon-icons.com/icons2/212/PNG/256/User-blue256_25016.png"),
            new User("023", "Simon", "https://cdn.icon-icons.com/icons2/212/PNG/256/User-yellow256_25012.png"),
            new User("024", "André", "https://cdn.icon-icons.com/icons2/212/PNG/256/User-green256_25015.png"),
            new User("025", "Leopold", "https://cdn.icon-icons.com/icons2/212/PNG/256/User-red256_25014.png")
    );
}
