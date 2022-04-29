package comspring.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import comspring.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
