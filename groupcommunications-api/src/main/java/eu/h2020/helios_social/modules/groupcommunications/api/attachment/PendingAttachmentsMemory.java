package eu.h2020.helios_social.modules.groupcommunications.api.attachment;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


/**
 * Annotation for injecting the attachment memory.
 * The contract of this memory is that incoming attachment info will be kept in memory until
 * all attachments have been downloaded successfully.
 */
@Qualifier
@Target({FIELD, METHOD, PARAMETER})
@Retention(RUNTIME)
public @interface PendingAttachmentsMemory {
}
