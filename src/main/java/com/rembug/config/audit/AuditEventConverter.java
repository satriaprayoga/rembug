package com.rembug.config.audit;

import java.sql.Date;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.actuate.audit.AuditEvent;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Component;

import com.rembug.domain.PersistentAuditEvent;

@Component
public class AuditEventConverter {

	public List<AuditEvent> convertToAuditEvent(Iterable<PersistentAuditEvent> persistentAuditEvents) {
		if (persistentAuditEvents == null) {
			return Collections.emptyList();
		}
		List<AuditEvent> auditEvents = new ArrayList<>();
		for (PersistentAuditEvent persistentAuditEvent : persistentAuditEvents) {
			auditEvents.add(convertToAuditEvent(persistentAuditEvent));
		}
		return auditEvents;
	}

	public AuditEvent convertToAuditEvent(PersistentAuditEvent persistentAuditEvent) {
		Instant instant = persistentAuditEvent.getAuditEventDate().atZone(ZoneId.systemDefault()).toInstant();
		return new AuditEvent(Date.from(instant), persistentAuditEvent.getPrincipal(),
				persistentAuditEvent.getAuditEventType(), convertDataToObjects(persistentAuditEvent.getData()));
	}

	public Map<String, Object> convertDataToObjects(Map<String, String> data) {
		Map<String, Object> result = new HashMap<>();
		if (data != null) {
			for (Map.Entry<String, String> entry : data.entrySet()) {
				result.put(entry.getKey(), entry.getValue());
			}
		}
		return result;
	}

	public Map<String, String> convertDataToStrings(Map<String, Object> data) {
		Map<String, String> result = new HashMap<>();
		if (data != null) {
			for (Map.Entry<String, Object> entry : data.entrySet()) {
				Object object = entry.getValue();
				if (object instanceof WebAuthenticationDetails) {
					WebAuthenticationDetails authenticationDetails = (WebAuthenticationDetails) object;
					result.put("sessionId", authenticationDetails.getSessionId());
					result.put("remoteAddress", authenticationDetails.getRemoteAddress());
				} else if (object != null) {
					result.put(entry.getKey(), object.toString());
				} else {
					result.put(entry.getKey(), "null");
				}
			}
		}
		return result;
	}
}
