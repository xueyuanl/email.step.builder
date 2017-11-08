package com.emc.step;

import com.emc.EmailAddress;

public interface ToStep {
    SubjectStep to(EmailAddress... to);
}
