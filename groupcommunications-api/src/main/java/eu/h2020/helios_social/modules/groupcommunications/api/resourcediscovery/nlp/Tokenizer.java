package eu.h2020.helios_social.modules.groupcommunications.api.resourcediscovery.nlp;

import java.util.List;

public interface Tokenizer {

    List<String> tokenize(String str);
}
