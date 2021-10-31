package eu.h2020.helios_social.modules.groupcommunications.api.mining;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class MathUtils {

    public static List<Double> findTopK(List<Double> input, int k) {
        Set<Double> sortedSet = new TreeSet<>(Comparator.reverseOrder());
        sortedSet.addAll(input);

        return sortedSet.stream().limit(k).collect(Collectors.toList());
    }
}
