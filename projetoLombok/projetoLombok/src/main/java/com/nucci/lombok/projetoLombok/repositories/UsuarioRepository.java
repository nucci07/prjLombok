package com.nucci.lombok.projetoLombok.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nucci.lombok.projetoLombok.entities.Usuario;

public class UsuarioRepository {


	public interface Repository extends JpaRepository<Usuario, Long>{

	}
}

