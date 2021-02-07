/**
 *
 */
package com.school.dataserv.domain;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.MappedSuperclass;


/**
 * @author sathsubramanian
 */
@MappedSuperclass
public class BasicVO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private LocalDate createdDate;
    private LocalDate updatedDate;
    private String createBy;
    private String updateBy;
    
    /**
     * @return the createdDate
     */
    public LocalDate getCreatedDate() {
        return createdDate;
    }

    /**
     * @param createdDate
     *            the createdDate to set
     */
    public void setCreatedDate(final LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * @return the updatedDate
     */
    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    /**
     * @param updatedDate
     *            the updatedDate to set
     */
    public void setUpdatedDate(final LocalDate updatedDate) {
        this.updatedDate = updatedDate;
    }

	/**
	 * @return the createBy
	 */
	public String getCreateBy() {
		return createBy;
	}

	/**
	 * @param createBy the createBy to set
	 */
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	/**
	 * @return the updateBy
	 */
	public String getUpdateBy() {
		return updateBy;
	}

	/**
	 * @param updateBy the updateBy to set
	 */
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

}
