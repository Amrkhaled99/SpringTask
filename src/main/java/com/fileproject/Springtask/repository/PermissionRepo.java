package com.fileproject.Springtask.repository;

import com.fileproject.Springtask.model.Permissions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PermissionRepo  extends JpaRepository<Permissions,Long> {
}
