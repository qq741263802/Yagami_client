package springboot.model;

import java.io.Serializable;

/**
 * =================================================================
 * ����һ�������Ƶ�������������������κ�δ�������ǰ���¶Գ����������޸ĺ�������ҵ��;��Ҳ������Գ�������޸ĺ����κ���ʽ�κ�Ŀ�ĵ��ٷ�����
 * Ϊ���������ߵ��Ͷ��ɹ���LuckyFrame�ؼ���Ȩ��Ϣ�Ͻ��۸�
 * ���κ����ʻ�ӭ��ϵ�������ۡ� QQ:1573584944  seagull1985
 * =================================================================
 * ע��������̳�Serializable
 * @author seagull
 */
public class RunTaskEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	/*������������*/
	private String schedulingName;
	/*����ִ��ID*/
    private String taskId;
    /*��������·��*/
    private String loadPath;
    
	public String getSchedulingName() {
		return schedulingName;
	}
	public void setSchedulingName(String schedulingName) {
		this.schedulingName = schedulingName;
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getLoadPath() {
		return loadPath;
	}
	public void setLoadPath(String loadPath) {
		this.loadPath = loadPath;
	}

}
