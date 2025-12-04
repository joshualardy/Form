document.addEventListener('DOMContentLoaded', () => {
    const form = document.getElementById('contact-form');
    const successMessage = document.getElementById('success-message');
    
    if (!form || !successMessage) return;
    
    const fields = {
        firstName: document.getElementById('first-name'),
        lastName: document.getElementById('last-name'),
        email: document.getElementById('email'),
        queryType: document.querySelectorAll('input[name="query-type"]'),
        message: document.getElementById('message'),
        consent: document.getElementById('consent')
    };
    
    // Utility functions
    const getFieldContainer = (field) => {
        return field.closest('.form-group') || 
               field.closest('.contact-email') || 
               field.closest('.contact-message') || 
               field.closest('.contact-query-type') || 
               field.closest('.contact-consent');
    };
    
    const showError = (field, container, errorSpan, message) => {
        if (field) field.classList.add('error');
        if (container) container.classList.add('error');
        if (errorSpan && message) {
            errorSpan.textContent = message;
            errorSpan.classList.add('show');
        }
    };
    
    const hideError = (field, container, errorSpan) => {
        if (field) field.classList.remove('error');
        if (container) container.classList.remove('error');
        if (errorSpan) errorSpan.classList.remove('show');
    };
    
    const validateField = (field, errorMessage) => {
        const container = getFieldContainer(field);
        const errorSpan = container?.querySelector('.text-danger');
        
        if (!field.validity.valid) {
            showError(field, container, errorSpan, errorMessage);
            return false;
        }
        hideError(field, container, errorSpan);
        return true;
    };
    
    const validateEmail = () => {
        const container = fields.email.closest('.contact-email');
        const errorSpan = container?.querySelector('.email-error');
        
        if (!fields.email.value.trim()) {
            showError(fields.email, container, errorSpan, 'This field is required');
            return false;
        }
        if (!fields.email.validity.valid) {
            showError(fields.email, container, errorSpan, 'Please enter a valid email address');
            return false;
        }
        hideError(fields.email, container, errorSpan);
        return true;
    };
    
    const validateQueryType = () => {
        const container = document.querySelector('.contact-query-type');
        const errorSpan = container?.querySelector('.text-danger');
        const isChecked = Array.from(fields.queryType).some(radio => radio.checked);
        
        if (!isChecked) {
            showError(null, container, errorSpan, 'Please select a query type');
            return false;
        }
        hideError(null, container, errorSpan);
        return true;
    };
    
    const validateConsent = () => {
        const container = document.querySelector('.contact-consent');
        const errorSpan = container?.querySelector('.text-danger');
        
        if (!fields.consent.checked) {
            showError(null, container, errorSpan, 'To submit this form, please consent to being contacted');
            return false;
        }
        hideError(null, container, errorSpan);
        return true;
    };
    
    // Event listeners for real-time validation
    fields.firstName.addEventListener('blur', () => validateField(fields.firstName, 'This field is required'));
    fields.lastName.addEventListener('blur', () => validateField(fields.lastName, 'This field is required'));
    fields.email.addEventListener('blur', validateEmail);
    fields.message.addEventListener('blur', () => validateField(fields.message, 'This field is required'));
    fields.consent.addEventListener('change', validateConsent);
    fields.queryType.forEach(radio => radio.addEventListener('change', validateQueryType));
    
    // Form submission
    form.addEventListener('submit', (e) => {
        e.preventDefault();
        
        const isValid = 
            validateField(fields.firstName, 'This field is required') &&
            validateField(fields.lastName, 'This field is required') &&
            validateEmail() &&
            validateQueryType() &&
            validateField(fields.message, 'This field is required') &&
            validateConsent();
        
        if (isValid) {
            // Clear all errors
            document.querySelectorAll('.text-danger').forEach(span => span.classList.remove('show'));
            document.querySelectorAll('.error').forEach(el => el.classList.remove('error'));
            
            // Show success message
            successMessage.classList.add('show');
            window.scrollTo({ top: 0, behavior: 'smooth' });
            form.reset();
        } else {
            // Scroll to first error
            const firstError = form.querySelector('.error');
            firstError?.scrollIntoView({ behavior: 'smooth', block: 'center' });
        }
    });
});

