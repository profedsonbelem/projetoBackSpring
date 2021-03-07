package br.com.arq.back.serviceciclico;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.annotation.PostConstruct;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
 

import org.apache.tomcat.jni.User;
import org.hibernate.validator.internal.util.logging.LoggerFactory;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;

import com.mysql.cj.Constants;
import com.sun.el.stream.Optional;

import ch.qos.logback.classic.Logger;
import io.github.brfreitas.pagseguro.api.common.domain.CreditCard;
import io.github.brfreitas.pagseguro.api.common.domain.PaymentMethod;

public class EmailSend {

//	/
//		@Autowired
//		private TokenUtil tokenUtil;
//
//		@Autowired
//		private StatementGateway statementGateway;
//
//		@Autowired
//		private PlanGateway planGateway;
//
//		@Autowired
//		private UserGateway userGateway;
//
//		@Autowired
//		private CustomerGateway customerGateway;
//
//		@Autowired
//		private SqsSender sqsSender;
//
//		@Autowired
//		private EmailQueue emailQueue;
//
//		@Value("${ciclic.sqs.callback.email.queue.name}")
//		private String callbackEmailQueueName;
//
//		@Value("${ciclic.sqs.callback.email.queue.region}")
//		private String callbackEmailQueueRegion;
//
//		@Value("${ciclic.contact.email}")
//		private String contactEmail;
//
//		@Value("${ciclic.contact.phone}")
//		private String contactPhone;
//
		//@PostConstruct
		public void init() {
			//Locale inLocale = new Locale("pt", "BR");
		///	this.decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(inLocale);
		//	this.decimalFormat.applyPattern("#,##0.00");
		}
//
		
		public void print() {
			System.out.println("ola");
								
		}
//		public void sendBankSlipEmail(BankSlip bankSlip, Map<String, String> attachments) {
//
//		//	PlanGetResponseDto plan = this.planGateway.findByPlanUuidV2(bankSlip.getWallet().getPlanUuid());
//		//	UserGetResponseDto user = this.userGateway.findByUserUuid(plan.getUserUuid());
//		//	StatementBalanceResponseDto statement = getBalance(plan, user);
//
//			HashMap<String, String> templateValues = new HashMap<>();
//			templateValues.put("userFirstName", user.getName());
//			templateValues.put("instalment", bigDecimalToString(plan.getInstalment()));
//			templateValues.put("value", bigDecimalToString(bankSlip.getValue()));
//			templateValues.put("bankSlipDueDate", getDayAndMonth(bankSlip.getDueDate()));
//			templateValues.put("bankSlipBarcode", bankSlip.getBarCode());
//			templateValues.put("bankSlipDigitableLine", bankSlip.getDigitableLine());
//			templateValues.put("dreamName", plan.getDream().getName());
//			templateValues.put("currentValue", bigDecimalToString(statement.getAmountTotal()));
//		//	this.sqsSender.send(this.emailQueue,
//			//		new EmailDto(BANKSLIP_SUBJECT, singletonList(user.getEmail()), attachments, BANKSLIP_TEMPLATE_NAME,
//				//			templateValues,
//				//			new Callback(callbackEmailQueueRegion, bankSlip.getUuid(), callbackEmailQueueName)),
//				//	null);
//		}
//
//		public void sendDebitWelcomeEmail(Debit debit) {
//		//	PlanGetResponseDto plan = this.planGateway.findByPlanUuidV2(debit.getWallet().getPlanUuid());
//		//	UserGetResponseDto user = this.userGateway.findByUserUuid(plan.getUserUuid());
//
//			HashMap<String, String> templateValues = new HashMap<>();
//			templateValues.put("userFirstName", user.getName());
//			templateValues.put("instalment", bigDecimalToString(plan.getInstalment()));
//			templateValues.put("targetValue", bigDecimalToString(plan.getTargetValue()));
//			templateValues.put("contributionTimeInYears", plan.getContributionTimeInYears().toString());
//			templateValues.put("value", bigDecimalToString(debit.getValue()));
//			templateValues.put("paymentDay", debit.getWallet().getPaymentDay().toString());
//
//		//	this.sqsSender.send(this.emailQueue, new EmailDto(FIRST_DEBIT_SUBJECT, singletonList(user.getEmail()),
//					FIRST_DEBIT_TEMPLATE_NAME, templateValues, null), null);
//
//		}
//
//		public void sendErrorProcessingDebitEmail(BigDecimal value, String planUuid, Integer paymentDay) {
//		//	PlanGetResponseDto plan = this.planGateway.findByPlanUuidV2(planUuid);
//		//	UserGetResponseDto user = this.userGateway.findByUserUuid(plan.getUserUuid());
//
//			HashMap<String, String> templateValues = new HashMap<>();
//			templateValues.put("userFirstName", user.getName());
//			templateValues.put("value", bigDecimalToString(value));
//			templateValues.put("paymentDay", paymentDay.toString());
//
//		//	this.sqsSender.send(this.emailQueue, new EmailDto(DEBIT_PROCESSING_ERROR_SUBJECT,
//					singletonList(user.getEmail()), DEBIT_PROCESSING_ERROR_NAME, templateValues, null), null);
//
//		}
//
		public void senderMail(final String mail) throws UnsupportedEncodingException, MessagingException {
  System.out.println("ola");
//			Properties props = new Properties();
//			props.setProperty("mail.transport.protocol", "smtp");
//			props.setProperty("mail.host", mail.getSmtpHostMail());
//			props.setProperty("mail.smtp.auth", mail.getSmtpAuth());
//			props.setProperty("mail.smtp.starttls.enable", mail.getSmtpStarttls());
//			props.setProperty("mail.smtp.port", mail.getSmtpPortMail());
//			props.setProperty("mail.mime.charset", mail.getCharsetMail());

			// classe anonima que realiza a autenticacao
			// do usuario no servidor de email.
			//Authenticator auth = new Authenticator() {
			//	public PasswordAuthentication getPasswordAuthentication() {
		//			return new PasswordAuthentication(mail.getUserMail(), mail.getPassMail());
			//	}
			};

			// Cria a sessao passando as propriedades e a autenticacao
		///	Session session = Session.getDefaultInstance(props, auth);
			// Gera um log no console referente ao processo de envio
			//session.setDebug(true);

			// cria a mensagem setando o remetente e seus destinatarios
			//Message msg = new MimeMessage(session);
			// aqui seta o remetente
			//msg.setFrom(new InternetAddress(mail.getUserMail(), mail.getFromNameMail()));
//			boolean first = true;
//			for (Map.Entry<String, String> map : mail.getToMailsUsers().entrySet()) {
//				if (first) {
//					// setamos o 1° destinatario
//					msg.addRecipient(Message.RecipientType.TO, new InternetAddress(map.getKey(), map.getValue()));
//					first = false;
//				} else {
//					// setamos os demais destinatarios
//					msg.addRecipient(Message.RecipientType.CC, new InternetAddress(map.getKey(), map.getValue()));
//				}
//			}

//			// Adiciona um Assunto a Mensagem
//			msg.setSubject(mail.getSubjectMail());
//
//			// Cria o objeto que recebe o texto do corpo do email
//			MimeBodyPart textPart = new MimeBodyPart();
//			textPart.setContent(mail.getBodyMail(), mail.getTypeTextMail());
//
//			// Monta a mensagem SMTP inserindo o conteudo, texto e anexos
//			Multipart mps = new MimeMultipart();
//			for (int index = 0; index < mail.getFileMails().size(); index++) {
//
//				// Cria um novo objeto para cada arquivo, e anexa o arquivo
//				MimeBodyPart attachFilePart = new MimeBodyPart();
//				FileDataSource fds = new FileDataSource(mail.getFileMails().get(index));
//				attachFilePart.setDataHandler(new DataHandler(fds));
//				attachFilePart.setFileName(fds.getName());
//
//				// adiciona os anexos da mensagem
//				mps.addBodyPart(attachFilePart, index);
//
//			}
//
//			// adiciona o corpo texto da mensagem
//			mps.addBodyPart(textPart);
//
//			// adiciona a mensagem o conteudo texto e anexo
//			msg.setContent(mps);

			// Envia a Mensagem
			//Transport.send(msg);
		}


//
//		public void sendFirstBankSlipEmail(BankSlip bankSlip, Map<String, String> attachments) {
//			PlanGetResponseDto plan = this.planGateway.findByPlanUuidV2(bankSlip.getWallet().getPlanUuid());
//			UserGetResponseDto user = this.userGateway.findByUserUuid(plan.getUserUuid());
//			HashMap<String, String> templateValues = new HashMap<>();
//
//			templateValues.put("userFirstName", user.getName());
//			templateValues.put("instalment", bigDecimalToString(plan.getInstalment()));
//			templateValues.put("targetValue", bigDecimalToString(plan.getTargetValue()));
//			templateValues.put("value", bigDecimalToString(bankSlip.getValue()));
//			templateValues.put("contributionTimeInYears", plan.getContributionTimeInYears().toString());
//			templateValues.put("bankSlipDueDate", getDayAndMonth(bankSlip.getDueDate()));
//			templateValues.put("bankSlipDigitableLine", bankSlip.getDigitableLine());
//			templateValues.put("bankSlipBarcode", bankSlip.getBarCode());
//			templateValues.put("dreamName", plan.getDream().getName());
//			templateValues.put("dreamImage", plan.getDream().getImages().getPng());
//		//	this.sqsSender.send(this.emailQueue,
//		//			new EmailDto(FIRST_BANKSLIP_SUBJECT, singletonList(user.getEmail()), attachments,
//		//					FIRST_BANKSLIP_TEMPLATE_NAME, templateValues,
//			//				new Callback(callbackEmailQueueRegion, bankSlip.getUuid(), callbackEmailQueueName)),
//		//			null);
//		}
//
//		private String bigDecimalToString(BigDecimal value) {
//			return this.decimalFormat.format(value.setScale(2, RoundingMode.UNNECESSARY));
//		}
//
//		private String getDayAndMonth(LocalDate date) {
//			return date.atStartOfDay(ZoneId.of("Brazil/East")).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//		}
//
//		public void sendBonusConfirmationEmail(BankSlip bankSlip) {
//		///	PlanGetResponseDto plan = this.planGateway.findByPlanUuidV2(bankSlip.getWallet().getPlanUuid());
//		///	UserGetResponseDto user = this.userGateway.findByUserUuid(plan.getUserUuid());
//			HashMap<String, String> templateValues = new HashMap<>();
//
//			templateValues.put("userFirstName", user.getName());
//			templateValues.put("value", bigDecimalToString(bankSlip.getValue()));
//		//	this.sqsSender.send(this.emailQueue, new EmailDto(BONUS_CONFIRMATION_SUBJECT,
//			//		singletonList(user.getEmail()), BONUS_CONFIRMATION_NAME, templateValues, null), null);
//		}
//
//		public void sendRecurrentPaymentNotificationDebitEmail(PaymentMethod paymentMethod) {
////			PlanGetResponseDto plan = this.planGateway.findByPlanUuidV2(paymentMethod.getWallet().getPlanUuid());
////			UserGetResponseDto user = this.userGateway.findByUserUuid(plan.getUserUuid());
////			StatementBalanceResponseDto statement = getBalance(plan, user);
//
//			HashMap<String, String> templateValues = new HashMap<>();
//
//			templateValues.put("userFirstName", user.getName());
//			templateValues.put("currentValue", bigDecimalToString(statement.getAmountTotal()));
//			templateValues.put("dreamName", plan.getDream().getName());
//			templateValues.put("paymentDay", paymentMethod.getWallet().getPaymentDay().toString());
//			templateValues.put("value", bigDecimalToString(paymentMethod.getValue()));
////
////			this.sqsSender.send(this.emailQueue, new EmailDto(DEBIT_PAYMENT_NOTIFICATION_SUBJECT,
////					singletonList(user.getEmail()), DEBIT_PAYMENT_NOTIFICATION_TEMPLATE_NAME, templateValues, null),
////					null);
//		}
//
//		public void sendCreditCardWelcomeEmail(CreditCard creditCard) {
////			PlanGetResponseDto plan = this.planGateway.findByPlanUuidV2(creditCard.getWallet().getPlanUuid());
//			sendCreditCardWelcomeEmail(creditCard, plan);
//		}
//
//		public void sendCreditCardWelcomeEmail(CreditCard creditCard, PlanGetResponseDto plan) {
//			//UserGetResponseDto user = this.userGateway.findByUserUuid(plan.getUserUuid());
//
//			HashMap<String, String> templateValues = new HashMap<>();
//			templateValues.put("userFirstName", user.getName());
//			templateValues.put("dreamName", plan.getDream().getName());
//			templateValues.put("instalment", bigDecimalToString(plan.getInstalment()));
//			templateValues.put("targetValue", bigDecimalToString(plan.getTargetValue()));
//			templateValues.put("contributionTimeInYears", plan.getContributionTimeInYears().toString());
//			templateValues.put("digitalCard", getFinalNumberCard(creditCard.getCard().getCardNumber()));
//			templateValues.put("brand", creditCard.getCard().getBrand().name());
//
//	//	this.sqsSender.send(this.emailQueue, new EmailDto(FIRST_CREDIT_CARD_SUBJECT, singletonList(user.getEmail()),
//			//		FIRST_CREDIT_CARD_TEMPLATE_NAME, templateValues, null), null);
//		}
//
//		public void sendErrorProcessingCreditCardEmail(Card card, Wallet wallet) {
//			//PlanGetResponseDto plan = this.planGateway.findByPlanUuidV2(wallet.getPlanUuid());
//			//UserGetResponseDto user = this.userGateway.findByUserUuid(plan.getUserUuid());
//
//			HashMap<String, String> templateValues = new HashMap<>();
//			templateValues.put("userFirstName", user.getName());
//			templateValues.put("dreamName", plan.getDream().getName());
//			templateValues.put("instalment", bigDecimalToString(plan.getInstalment()));
//			templateValues.put("targetValue", bigDecimalToString(plan.getTargetValue()));
//			templateValues.put("contributionTimeInYears",
//					Optional.ofNullable(plan.getContributionTimeInYears()).map(Object::toString).orElse(""));
//			templateValues.put("brand", card.getBrand().name());
//			templateValues.put("digitalCard", getFinalNumberCard(card.getCardNumber()));
//
//		//	this.sqsSender.send(this.emailQueue, new EmailDto(CREDIT_CARD_PROCESSING_ERROR_SUBJECT,
//			//		singletonList(user.getEmail()), CREDIT_CARD_PROCESSING_ERROR_NAME, templateValues, null), null);
//		}
//
//		private String getFinalNumberCard(String card) {
//			int size = card.length();
//			return card.substring(size - 4, size);
//		}
//
//		public void sendPayrollWelcomeEmail(Payroll payRoll) {
//			throw new UnsupportedOperationException();
//		}
//
//		public void sendPayrollRecurrentEmail(Payroll payRoll) {
//			throw new UnsupportedOperationException();
//		}
//
//		public void sendEmailAnexo(final MailJava mail) {
//
//			Properties props = new Properties();
//			props.setProperty("mail.transport.protocol", "smtp");
//			props.setProperty("mail.host", mail.getSmtpHostMail());
//			props.setProperty("mail.smtp.auth", mail.getSmtpAuth());
//			props.setProperty("mail.smtp.starttls.enable", mail.getSmtpStarttls());
//			props.setProperty("mail.smtp.port", mail.getSmtpPortMail());
//			props.setProperty("mail.mime.charset", mail.getCharsetMail());
//
//			// classe anonima que realiza a autenticacao
//			// do usuario no servidor de email.
//		//	Authenticator auth = new Authenticator() {
////				public PasswordAuthentication getPasswordAuthentication() {
////					return new PasswordAuthentication(mail.getUserMail(), mail.getPassMail());
////				}
////			};
//
//			// Cria a sessao passando as propriedades e a autenticacao
//		//	Session session = Session.getDefaultInstance(props, auth);
//			// Gera um log no console referente ao processo de envio
//			session.setDebug(true);
//
//			// cria a mensagem setando o remetente e seus destinatarios
//			Message msg = new MimeMessage(session);
//			// aqui seta o remetente
////			msg.setFrom(new InternetAddress(mail.getUserMail(), mail.getFromNameMail()));
////			boolean first = true;
////			for (Map.Entry<String, String> map : mail.getToMailsUsers().entrySet()) {
////				if (first) {
////					// setamos o 1° destinatario
////					msg.addRecipient(Message.RecipientType.TO, new InternetAddress(map.getKey(), map.getValue()));
////					first = false;
////				} else {
////					// setamos os demais destinatarios
////					msg.addRecipient(Message.RecipientType.CC, new InternetAddress(map.getKey(), map.getValue()));
////				}
////			}
//
//			// Adiciona um Assunto a Mensagem
//			msg.setSubject(mail.getSubjectMail());
//
//			// Cria o objeto que recebe o texto do corpo do email
//			MimeBodyPart textPart = new MimeBodyPart();
//			textPart.setContent(mail.getBodyMail(), mail.getTypeTextMail());
//
//			// Monta a mensagem SMTP inserindo o conteudo, texto e anexos
//			Multipart mps = new MimeMultipart();
//			for (int index = 0; index < mail.getFileMails().size(); index++) {
//
//				// Cria um novo objeto para cada arquivo, e anexa o arquivo
//				MimeBodyPart attachFilePart = new MimeBodyPart();
//				FileDataSource fds = new FileDataSource(mail.getFileMails().get(index));
//				attachFilePart.setDataHandler(new DataHandler(fds));
//				attachFilePart.setFileName(fds.getName());
//
//				// adiciona os anexos da mensagem
//				mps.addBodyPart(attachFilePart, index);
//
//			}
//
//			// adiciona o corpo texto da mensagem
//			mps.addBodyPart(textPart);
//
//			// adiciona a mensagem o conteudo texto e anexo
//			msg.setContent(mps);
//
//			// Envia a Mensagem
//			Transport.send(msg);
//		}
// 
//
// 
//
//	public void sendEmail(User user) throws MailException {
//
//		/*
//		 * This JavaMailSender Interface is used to send Mail in Spring Boot. This
//		 * JavaMailSender extends the MailSender Interface which contains send()
//		 * function. SimpleMailMessage Object is required because send() function uses
//		 * object of SimpleMailMessage as a Parameter
//		 */
//
//		SimpleMailMessage mail = new SimpleMailMessage();
//		mail.setTo(user.getEmailAddress());
//		mail.setSubject("Testing Mail API");
//		mail.setText("Hurray ! You have done that dude...");
//
//		/*
//		 * This send() contains an Object of SimpleMailMessage as an Parameter
//		 */
//	//	javaMailSender.send(mail);
//	}
//
//	/**
//	 * This fucntion is used to send mail that contains a attachment.
//	 * 
//	 * @param user
//	 * @throws MailException
//	 * @throws MessagingException
//	 */
//	public void sendEmailWithAttachment(User user) throws MailException, MessagingException {
//
//		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
//
//		MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
//
//		helper.setTo(user.getEmailAddress());
//		helper.setSubject("Testing Mail API with Attachment");
//		helper.setText("Please find the attached document below.");
//
//		ClassPathResource classPathResource = new ClassPathResource("Attachment.pdf");
//		helper.addAttachment(classPathResource.getFilename(), classPathResource);
//
//	//	javaMailSender.send(mimeMessage);
//	}
//
//}
//
//	public void sendPayrollReportEmail(PayrollReportDto payrollReportDto, String partnerUuid) {
//
//		String token = this.tokenUtil.getTokenClientCredentials();
//		List<PartnerEmailDto> partnerEmailDtoList = this.customerGateway.findPartnerEmail(partnerUuid, token);
//		List<PartnerEmailDto> partnerEmailActivesDto = Optional.ofNullable(partnerEmailDtoList)
//				.orElse(new ArrayList<PartnerEmailDto>()).stream().filter(PartnerEmailDto::isActive)
//				.filter(p -> p.getType().equals(EmailType.MERCANTIL)).collect(Collectors.toList());
//
//		for (PartnerEmailDto partnerDto : partnerEmailActivesDto) {
//			HashMap<String, String> templateValues = new HashMap<>();
//
//			templateValues.put("currentMonth",
//					LocalDate.now().getMonth().getDisplayName(TextStyle.FULL, new Locale("pt")));
//			templateValues.put("totalEmployees", payrollReportDto.getTotalEmployees().toString());
//			templateValues.put("totalValue", this.decimalFormat.format(payrollReportDto.getTotalValue()));
//			templateValues.put("paymentRows", generateHtmlPaymentRows(payrollReportDto.getEmployee()));
//			templateValues.put("dueDate", YearMonth.now().atEndOfMonth().format(Constants.FORMATTER_DD_MM_YYYY));
//			templateValues.put("contactEmail", this.contactEmail);
//			templateValues.put("contactPhone", this.contactPhone);
//
//			this.sqsSender.send(this.emailQueue, new EmailDto(PAYROLL_REPORT_SUBJECT,
//					singletonList(partnerDto.getEmail()), PAYROLL_TEMPLATE_NAME, templateValues, null), null);
//		}
//	}
//
//	private String generateHtmlPaymentRows(List<EmployeeDto> employeeDtoList) {
//
//		StringBuilder html = new StringBuilder();
//
//		for (int i = 0; i < employeeDtoList.size(); i++) {
//
//			EmployeeDto employeeDto = employeeDtoList.get(i);
//
//			html.append(String.format("<tr class=\"employe-row %s\">", i % 2 == 0 ? "even" : "odd"));
//
//			html.append(String.format("<td>%s</td>", employeeDto.getEmployeeName()));
//			html.append(String.format("<td>%s</td>", employeeDto.getEmployeeCPF()));
//			html.append(String.format("<td>R$ %s</td>", this.decimalFormat.format(employeeDto.getBillingValue())));
//
//			html.append("</tr>");
//		}
//
//		logger.info("New HTML: {}", html);
//		return html.toString();
//	}
//
//	private StatementBalanceResponseDto getBalance(PlanGetResponseDto plan, UserGetResponseDto user) {
//		return this.statementGateway.findBalanceByPlanUuidAndUserUuid(user.getDocument(), plan.getRegisterNumber(),
//				plan.getCreationDate().toLocalDate().toString(), null, null);
//	}

//}
 