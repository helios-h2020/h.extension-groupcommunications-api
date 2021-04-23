package eu.h2020.helios_social.modules.groupcommunications.api.resourcediscovery.queries;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Annotation for injecting the query results memory.
 * The contract of this memory is that incoming results on submitted queries will be kept on memory
 * "remembered" for a defined time span. During shutdown all queries' results in memory will be discarded.
 */
@Qualifier
@Target({FIELD, METHOD, PARAMETER})
@Retention(RUNTIME)
public @interface QueryResultsCache {
}
