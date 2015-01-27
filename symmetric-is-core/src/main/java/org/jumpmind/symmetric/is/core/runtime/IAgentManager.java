package org.jumpmind.symmetric.is.core.runtime;

import java.util.Set;

import org.jumpmind.symmetric.is.core.config.Agent;
import org.jumpmind.symmetric.is.core.config.AgentDeployment;
import org.jumpmind.symmetric.is.core.config.ComponentFlowVersion;

public interface IAgentManager {

    public AgentEngine refresh(Agent agent);
    
    public void remove(Agent agent);
    
    public AgentEngine getAgentEngine(Agent agent);
    
    public AgentEngine getAgentEngine(String agentId);
    
    public boolean isAgentLocal(Agent agent);
    
    public void undeploy(AgentDeployment deployment);
    
    public AgentDeployment deploy(String agentId, ComponentFlowVersion componentFlowVersion);
    
    public void start();
    
    public Set<Agent> getLocalAgents();
    
    
}