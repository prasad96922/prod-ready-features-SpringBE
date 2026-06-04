
*** Steps to Add Auditing
1. Create Auditable base Entity using the following Annotations 
   @EntityListeners(AuditingEntityListener.class)
   This way you will get access to @CreatedBy, @CreatedDate, @LastModifiedBy, and @LastModifiedDate annotation
2. Extend all the Entities from the Superclass.
3. Enable @EnableJpaAuditing 
4. Create a class and implement the AuditorAware interface ---> spring security
5. Pass the reference of the AuditorAware class bean to the @EnableJpaAuditing interface


@PrePersist
void beforeSave() {

}

@PreUpdate
void beforeUpdate() {

}

@PreRemove
void beforeDelete() {

}

**** Hibernate (hibernate-envers) : versions maintaining

<dependency>
			<groupId>org.hibernate</groupId>
			<artifactId>hibernate-envers</artifactId>
			<version>6.5.2.Final</version>
</dependency>

---->@Audited

