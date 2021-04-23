package eu.h2020.helios_social.modules.groupcommunications.api.resourcediscovery.index;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import eu.h2020.helios_social.modules.groupcommunications.api.exception.DbException;
import eu.h2020.helios_social.modules.groupcommunications.api.exception.FormatException;
import eu.h2020.helios_social.modules.groupcommunications.api.resourcediscovery.EntityType;

public interface InvertedIndexManager<T> {

    /**
     * Adds terms to index
     *
     * @param txn
     * @param entityType
     * @param entityId
     * @param contextId
     * @param terms
     * @throws DbException
     * @throws FormatException
     */
    void addTerms(T txn, EntityType entityType, String entityId, String contextId, List<String> terms) throws DbException, FormatException;

    /**
     * Returns the vocabulary given the entity type (FORUM/MESSAGE/EVENT) in the given context
     *
     * @param txn
     * @param entityType
     * @param contextId
     * @return
     * @throws DbException
     * @throws FormatException
     */
    Set<String> getVocabulary(T txn, EntityType entityType, String contextId) throws DbException, FormatException;

    /**
     * Returns all entities of entity type in the given context that contain the given term
     *
     * @param txn
     * @param entityType
     * @param contextId
     * @param term
     * @return
     * @throws DbException
     * @throws FormatException
     */
    Set<String> getEntities(T txn, EntityType entityType, String contextId, String term) throws DbException, FormatException;

    /**
     * Returns term count of the given term
     *
     * @param txn
     * @param entityType
     * @param contextId
     * @param entityId
     * @param term
     * @return
     * @throws DbException
     * @throws FormatException
     */
    Integer getTermCount(T txn, EntityType entityType, String contextId, String entityId, String term) throws DbException, FormatException;


    void removeEntity(T txn, EntityType entityType, String entityId, String contextId) throws FormatException, DbException;
}
