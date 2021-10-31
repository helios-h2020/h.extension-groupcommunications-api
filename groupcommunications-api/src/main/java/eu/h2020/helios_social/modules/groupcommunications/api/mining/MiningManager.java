package eu.h2020.helios_social.modules.groupcommunications.api.mining;

import java.util.HashMap;
import java.util.List;

import eu.h2020.helios_social.core.contextualegonetwork.Node;
import eu.h2020.helios_social.modules.socialgraphmining.SocialGraphMiner;

public interface MiningManager {

    HashMap<Node, Double> getNextInteractionRecommendations(String egoContextId);

    HashMap<Node, Double> getInteractionRecommendationsProbabilities(String egoContextId);


    List getSmoothPersonalizedProfile(ContentAwareProfilingType profilingType);
}
