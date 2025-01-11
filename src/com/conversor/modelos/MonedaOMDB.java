package com.conversor.modelos;

import java.util.HashMap;

public record MonedaOMDB(String base_code, HashMap<String, String> conversion_rates) {
}
