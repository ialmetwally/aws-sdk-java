/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * RequestSpotFleetRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RequestSpotFleetRequestMarshaller implements Marshaller<Request<RequestSpotFleetRequest>, RequestSpotFleetRequest> {

    public Request<RequestSpotFleetRequest> marshall(RequestSpotFleetRequest requestSpotFleetRequest) {

        if (requestSpotFleetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RequestSpotFleetRequest> request = new DefaultRequest<RequestSpotFleetRequest>(requestSpotFleetRequest, "AmazonEC2");
        request.addParameter("Action", "RequestSpotFleet");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        SpotFleetRequestConfigData spotFleetRequestConfig = requestSpotFleetRequest.getSpotFleetRequestConfig();
        if (spotFleetRequestConfig != null) {

            if (spotFleetRequestConfig.getAllocationStrategy() != null) {
                request.addParameter("SpotFleetRequestConfig.AllocationStrategy", StringUtils.fromString(spotFleetRequestConfig.getAllocationStrategy()));
            }

            if (spotFleetRequestConfig.getClientToken() != null) {
                request.addParameter("SpotFleetRequestConfig.ClientToken", StringUtils.fromString(spotFleetRequestConfig.getClientToken()));
            }

            if (spotFleetRequestConfig.getExcessCapacityTerminationPolicy() != null) {
                request.addParameter("SpotFleetRequestConfig.ExcessCapacityTerminationPolicy",
                        StringUtils.fromString(spotFleetRequestConfig.getExcessCapacityTerminationPolicy()));
            }

            if (spotFleetRequestConfig.getFulfilledCapacity() != null) {
                request.addParameter("SpotFleetRequestConfig.FulfilledCapacity", StringUtils.fromDouble(spotFleetRequestConfig.getFulfilledCapacity()));
            }

            if (spotFleetRequestConfig.getIamFleetRole() != null) {
                request.addParameter("SpotFleetRequestConfig.IamFleetRole", StringUtils.fromString(spotFleetRequestConfig.getIamFleetRole()));
            }

            com.amazonaws.internal.SdkInternalList<SpotFleetLaunchSpecification> spotFleetRequestConfigDataLaunchSpecificationsList = (com.amazonaws.internal.SdkInternalList<SpotFleetLaunchSpecification>) spotFleetRequestConfig
                    .getLaunchSpecifications();
            if (!spotFleetRequestConfigDataLaunchSpecificationsList.isEmpty() || !spotFleetRequestConfigDataLaunchSpecificationsList.isAutoConstruct()) {
                int launchSpecificationsListIndex = 1;

                for (SpotFleetLaunchSpecification spotFleetRequestConfigDataLaunchSpecificationsListValue : spotFleetRequestConfigDataLaunchSpecificationsList) {

                    com.amazonaws.internal.SdkInternalList<GroupIdentifier> spotFleetLaunchSpecificationSecurityGroupsList = (com.amazonaws.internal.SdkInternalList<GroupIdentifier>) spotFleetRequestConfigDataLaunchSpecificationsListValue
                            .getSecurityGroups();
                    if (!spotFleetLaunchSpecificationSecurityGroupsList.isEmpty() || !spotFleetLaunchSpecificationSecurityGroupsList.isAutoConstruct()) {
                        int securityGroupsListIndex = 1;

                        for (GroupIdentifier spotFleetLaunchSpecificationSecurityGroupsListValue : spotFleetLaunchSpecificationSecurityGroupsList) {

                            if (spotFleetLaunchSpecificationSecurityGroupsListValue.getGroupName() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".GroupSet."
                                        + securityGroupsListIndex + ".GroupName",
                                        StringUtils.fromString(spotFleetLaunchSpecificationSecurityGroupsListValue.getGroupName()));
                            }

                            if (spotFleetLaunchSpecificationSecurityGroupsListValue.getGroupId() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".GroupSet."
                                        + securityGroupsListIndex + ".GroupId",
                                        StringUtils.fromString(spotFleetLaunchSpecificationSecurityGroupsListValue.getGroupId()));
                            }
                            securityGroupsListIndex++;
                        }
                    }

                    if (spotFleetRequestConfigDataLaunchSpecificationsListValue.getAddressingType() != null) {
                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".AddressingType",
                                StringUtils.fromString(spotFleetRequestConfigDataLaunchSpecificationsListValue.getAddressingType()));
                    }

                    com.amazonaws.internal.SdkInternalList<BlockDeviceMapping> spotFleetLaunchSpecificationBlockDeviceMappingsList = (com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>) spotFleetRequestConfigDataLaunchSpecificationsListValue
                            .getBlockDeviceMappings();
                    if (!spotFleetLaunchSpecificationBlockDeviceMappingsList.isEmpty()
                            || !spotFleetLaunchSpecificationBlockDeviceMappingsList.isAutoConstruct()) {
                        int blockDeviceMappingsListIndex = 1;

                        for (BlockDeviceMapping spotFleetLaunchSpecificationBlockDeviceMappingsListValue : spotFleetLaunchSpecificationBlockDeviceMappingsList) {

                            if (spotFleetLaunchSpecificationBlockDeviceMappingsListValue.getDeviceName() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".BlockDeviceMapping."
                                        + blockDeviceMappingsListIndex + ".DeviceName",
                                        StringUtils.fromString(spotFleetLaunchSpecificationBlockDeviceMappingsListValue.getDeviceName()));
                            }

                            if (spotFleetLaunchSpecificationBlockDeviceMappingsListValue.getVirtualName() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".BlockDeviceMapping."
                                        + blockDeviceMappingsListIndex + ".VirtualName",
                                        StringUtils.fromString(spotFleetLaunchSpecificationBlockDeviceMappingsListValue.getVirtualName()));
                            }

                            EbsBlockDevice ebs = spotFleetLaunchSpecificationBlockDeviceMappingsListValue.getEbs();
                            if (ebs != null) {

                                if (ebs.getEncrypted() != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                            + ".BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.Encrypted",
                                            StringUtils.fromBoolean(ebs.getEncrypted()));
                                }

                                if (ebs.getDeleteOnTermination() != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                            + ".BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.DeleteOnTermination",
                                            StringUtils.fromBoolean(ebs.getDeleteOnTermination()));
                                }

                                if (ebs.getIops() != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                            + ".BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.Iops", StringUtils.fromInteger(ebs.getIops()));
                                }

                                if (ebs.getSnapshotId() != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                            + ".BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.SnapshotId",
                                            StringUtils.fromString(ebs.getSnapshotId()));
                                }

                                if (ebs.getVolumeSize() != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                            + ".BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.VolumeSize",
                                            StringUtils.fromInteger(ebs.getVolumeSize()));
                                }

                                if (ebs.getVolumeType() != null) {
                                    request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                            + ".BlockDeviceMapping." + blockDeviceMappingsListIndex + ".Ebs.VolumeType",
                                            StringUtils.fromString(ebs.getVolumeType()));
                                }
                            }

                            if (spotFleetLaunchSpecificationBlockDeviceMappingsListValue.getNoDevice() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".BlockDeviceMapping."
                                        + blockDeviceMappingsListIndex + ".NoDevice",
                                        StringUtils.fromString(spotFleetLaunchSpecificationBlockDeviceMappingsListValue.getNoDevice()));
                            }
                            blockDeviceMappingsListIndex++;
                        }
                    }

                    if (spotFleetRequestConfigDataLaunchSpecificationsListValue.getEbsOptimized() != null) {
                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".EbsOptimized",
                                StringUtils.fromBoolean(spotFleetRequestConfigDataLaunchSpecificationsListValue.getEbsOptimized()));
                    }

                    IamInstanceProfileSpecification iamInstanceProfile = spotFleetRequestConfigDataLaunchSpecificationsListValue.getIamInstanceProfile();
                    if (iamInstanceProfile != null) {

                        if (iamInstanceProfile.getArn() != null) {
                            request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".IamInstanceProfile.Arn",
                                    StringUtils.fromString(iamInstanceProfile.getArn()));
                        }

                        if (iamInstanceProfile.getName() != null) {
                            request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".IamInstanceProfile.Name",
                                    StringUtils.fromString(iamInstanceProfile.getName()));
                        }
                    }

                    if (spotFleetRequestConfigDataLaunchSpecificationsListValue.getImageId() != null) {
                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".ImageId",
                                StringUtils.fromString(spotFleetRequestConfigDataLaunchSpecificationsListValue.getImageId()));
                    }

                    if (spotFleetRequestConfigDataLaunchSpecificationsListValue.getInstanceType() != null) {
                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".InstanceType",
                                StringUtils.fromString(spotFleetRequestConfigDataLaunchSpecificationsListValue.getInstanceType()));
                    }

                    if (spotFleetRequestConfigDataLaunchSpecificationsListValue.getKernelId() != null) {
                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".KernelId",
                                StringUtils.fromString(spotFleetRequestConfigDataLaunchSpecificationsListValue.getKernelId()));
                    }

                    if (spotFleetRequestConfigDataLaunchSpecificationsListValue.getKeyName() != null) {
                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".KeyName",
                                StringUtils.fromString(spotFleetRequestConfigDataLaunchSpecificationsListValue.getKeyName()));
                    }

                    SpotFleetMonitoring monitoring = spotFleetRequestConfigDataLaunchSpecificationsListValue.getMonitoring();
                    if (monitoring != null) {

                        if (monitoring.getEnabled() != null) {
                            request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".Monitoring.Enabled",
                                    StringUtils.fromBoolean(monitoring.getEnabled()));
                        }
                    }

                    com.amazonaws.internal.SdkInternalList<InstanceNetworkInterfaceSpecification> spotFleetLaunchSpecificationNetworkInterfacesList = (com.amazonaws.internal.SdkInternalList<InstanceNetworkInterfaceSpecification>) spotFleetRequestConfigDataLaunchSpecificationsListValue
                            .getNetworkInterfaces();
                    if (!spotFleetLaunchSpecificationNetworkInterfacesList.isEmpty() || !spotFleetLaunchSpecificationNetworkInterfacesList.isAutoConstruct()) {
                        int networkInterfacesListIndex = 1;

                        for (InstanceNetworkInterfaceSpecification spotFleetLaunchSpecificationNetworkInterfacesListValue : spotFleetLaunchSpecificationNetworkInterfacesList) {

                            if (spotFleetLaunchSpecificationNetworkInterfacesListValue.getAssociatePublicIpAddress() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet."
                                        + networkInterfacesListIndex + ".AssociatePublicIpAddress",
                                        StringUtils.fromBoolean(spotFleetLaunchSpecificationNetworkInterfacesListValue.getAssociatePublicIpAddress()));
                            }

                            if (spotFleetLaunchSpecificationNetworkInterfacesListValue.getDeleteOnTermination() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet."
                                        + networkInterfacesListIndex + ".DeleteOnTermination",
                                        StringUtils.fromBoolean(spotFleetLaunchSpecificationNetworkInterfacesListValue.getDeleteOnTermination()));
                            }

                            if (spotFleetLaunchSpecificationNetworkInterfacesListValue.getDescription() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet."
                                        + networkInterfacesListIndex + ".Description",
                                        StringUtils.fromString(spotFleetLaunchSpecificationNetworkInterfacesListValue.getDescription()));
                            }

                            if (spotFleetLaunchSpecificationNetworkInterfacesListValue.getDeviceIndex() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet."
                                        + networkInterfacesListIndex + ".DeviceIndex",
                                        StringUtils.fromInteger(spotFleetLaunchSpecificationNetworkInterfacesListValue.getDeviceIndex()));
                            }

                            com.amazonaws.internal.SdkInternalList<String> instanceNetworkInterfaceSpecificationGroupsList = (com.amazonaws.internal.SdkInternalList<String>) spotFleetLaunchSpecificationNetworkInterfacesListValue
                                    .getGroups();
                            if (!instanceNetworkInterfaceSpecificationGroupsList.isEmpty()
                                    || !instanceNetworkInterfaceSpecificationGroupsList.isAutoConstruct()) {
                                int groupsListIndex = 1;

                                for (String instanceNetworkInterfaceSpecificationGroupsListValue : instanceNetworkInterfaceSpecificationGroupsList) {
                                    if (instanceNetworkInterfaceSpecificationGroupsListValue != null) {
                                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                                + ".NetworkInterfaceSet." + networkInterfacesListIndex + ".SecurityGroupId." + groupsListIndex,
                                                StringUtils.fromString(instanceNetworkInterfaceSpecificationGroupsListValue));
                                    }
                                    groupsListIndex++;
                                }
                            }

                            if (spotFleetLaunchSpecificationNetworkInterfacesListValue.getIpv6AddressCount() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet."
                                        + networkInterfacesListIndex + ".Ipv6AddressCount",
                                        StringUtils.fromInteger(spotFleetLaunchSpecificationNetworkInterfacesListValue.getIpv6AddressCount()));
                            }

                            com.amazonaws.internal.SdkInternalList<InstanceIpv6Address> instanceNetworkInterfaceSpecificationIpv6AddressesList = (com.amazonaws.internal.SdkInternalList<InstanceIpv6Address>) spotFleetLaunchSpecificationNetworkInterfacesListValue
                                    .getIpv6Addresses();
                            if (!instanceNetworkInterfaceSpecificationIpv6AddressesList.isEmpty()
                                    || !instanceNetworkInterfaceSpecificationIpv6AddressesList.isAutoConstruct()) {
                                int ipv6AddressesListIndex = 1;

                                for (InstanceIpv6Address instanceNetworkInterfaceSpecificationIpv6AddressesListValue : instanceNetworkInterfaceSpecificationIpv6AddressesList) {

                                    if (instanceNetworkInterfaceSpecificationIpv6AddressesListValue.getIpv6Address() != null) {
                                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                                + ".NetworkInterfaceSet." + networkInterfacesListIndex + ".Ipv6Addresses." + ipv6AddressesListIndex
                                                + ".Ipv6Address",
                                                StringUtils.fromString(instanceNetworkInterfaceSpecificationIpv6AddressesListValue.getIpv6Address()));
                                    }
                                    ipv6AddressesListIndex++;
                                }
                            }

                            if (spotFleetLaunchSpecificationNetworkInterfacesListValue.getNetworkInterfaceId() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet."
                                        + networkInterfacesListIndex + ".NetworkInterfaceId",
                                        StringUtils.fromString(spotFleetLaunchSpecificationNetworkInterfacesListValue.getNetworkInterfaceId()));
                            }

                            if (spotFleetLaunchSpecificationNetworkInterfacesListValue.getPrivateIpAddress() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet."
                                        + networkInterfacesListIndex + ".PrivateIpAddress",
                                        StringUtils.fromString(spotFleetLaunchSpecificationNetworkInterfacesListValue.getPrivateIpAddress()));
                            }

                            com.amazonaws.internal.SdkInternalList<PrivateIpAddressSpecification> instanceNetworkInterfaceSpecificationPrivateIpAddressesList = (com.amazonaws.internal.SdkInternalList<PrivateIpAddressSpecification>) spotFleetLaunchSpecificationNetworkInterfacesListValue
                                    .getPrivateIpAddresses();
                            if (!instanceNetworkInterfaceSpecificationPrivateIpAddressesList.isEmpty()
                                    || !instanceNetworkInterfaceSpecificationPrivateIpAddressesList.isAutoConstruct()) {
                                int privateIpAddressesListIndex = 1;

                                for (PrivateIpAddressSpecification instanceNetworkInterfaceSpecificationPrivateIpAddressesListValue : instanceNetworkInterfaceSpecificationPrivateIpAddressesList) {

                                    if (instanceNetworkInterfaceSpecificationPrivateIpAddressesListValue.getPrimary() != null) {
                                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                                + ".NetworkInterfaceSet." + networkInterfacesListIndex + ".PrivateIpAddresses." + privateIpAddressesListIndex
                                                + ".Primary",
                                                StringUtils.fromBoolean(instanceNetworkInterfaceSpecificationPrivateIpAddressesListValue.getPrimary()));
                                    }

                                    if (instanceNetworkInterfaceSpecificationPrivateIpAddressesListValue.getPrivateIpAddress() != null) {
                                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex
                                                + ".NetworkInterfaceSet." + networkInterfacesListIndex + ".PrivateIpAddresses." + privateIpAddressesListIndex
                                                + ".PrivateIpAddress",
                                                StringUtils.fromString(instanceNetworkInterfaceSpecificationPrivateIpAddressesListValue.getPrivateIpAddress()));
                                    }
                                    privateIpAddressesListIndex++;
                                }
                            }

                            if (spotFleetLaunchSpecificationNetworkInterfacesListValue.getSecondaryPrivateIpAddressCount() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet."
                                        + networkInterfacesListIndex + ".SecondaryPrivateIpAddressCount",
                                        StringUtils.fromInteger(spotFleetLaunchSpecificationNetworkInterfacesListValue.getSecondaryPrivateIpAddressCount()));
                            }

                            if (spotFleetLaunchSpecificationNetworkInterfacesListValue.getSubnetId() != null) {
                                request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".NetworkInterfaceSet."
                                        + networkInterfacesListIndex + ".SubnetId",
                                        StringUtils.fromString(spotFleetLaunchSpecificationNetworkInterfacesListValue.getSubnetId()));
                            }
                            networkInterfacesListIndex++;
                        }
                    }

                    SpotPlacement placement = spotFleetRequestConfigDataLaunchSpecificationsListValue.getPlacement();
                    if (placement != null) {

                        if (placement.getAvailabilityZone() != null) {
                            request.addParameter(
                                    "SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".Placement.AvailabilityZone",
                                    StringUtils.fromString(placement.getAvailabilityZone()));
                        }

                        if (placement.getGroupName() != null) {
                            request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".Placement.GroupName",
                                    StringUtils.fromString(placement.getGroupName()));
                        }

                        if (placement.getTenancy() != null) {
                            request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".Placement.Tenancy",
                                    StringUtils.fromString(placement.getTenancy()));
                        }
                    }

                    if (spotFleetRequestConfigDataLaunchSpecificationsListValue.getRamdiskId() != null) {
                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".RamdiskId",
                                StringUtils.fromString(spotFleetRequestConfigDataLaunchSpecificationsListValue.getRamdiskId()));
                    }

                    if (spotFleetRequestConfigDataLaunchSpecificationsListValue.getSpotPrice() != null) {
                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".SpotPrice",
                                StringUtils.fromString(spotFleetRequestConfigDataLaunchSpecificationsListValue.getSpotPrice()));
                    }

                    if (spotFleetRequestConfigDataLaunchSpecificationsListValue.getSubnetId() != null) {
                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".SubnetId",
                                StringUtils.fromString(spotFleetRequestConfigDataLaunchSpecificationsListValue.getSubnetId()));
                    }

                    if (spotFleetRequestConfigDataLaunchSpecificationsListValue.getUserData() != null) {
                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".UserData",
                                StringUtils.fromString(spotFleetRequestConfigDataLaunchSpecificationsListValue.getUserData()));
                    }

                    if (spotFleetRequestConfigDataLaunchSpecificationsListValue.getWeightedCapacity() != null) {
                        request.addParameter("SpotFleetRequestConfig.LaunchSpecifications." + launchSpecificationsListIndex + ".WeightedCapacity",
                                StringUtils.fromDouble(spotFleetRequestConfigDataLaunchSpecificationsListValue.getWeightedCapacity()));
                    }
                    launchSpecificationsListIndex++;
                }
            }

            if (spotFleetRequestConfig.getSpotPrice() != null) {
                request.addParameter("SpotFleetRequestConfig.SpotPrice", StringUtils.fromString(spotFleetRequestConfig.getSpotPrice()));
            }

            if (spotFleetRequestConfig.getTargetCapacity() != null) {
                request.addParameter("SpotFleetRequestConfig.TargetCapacity", StringUtils.fromInteger(spotFleetRequestConfig.getTargetCapacity()));
            }

            if (spotFleetRequestConfig.getTerminateInstancesWithExpiration() != null) {
                request.addParameter("SpotFleetRequestConfig.TerminateInstancesWithExpiration",
                        StringUtils.fromBoolean(spotFleetRequestConfig.getTerminateInstancesWithExpiration()));
            }

            if (spotFleetRequestConfig.getType() != null) {
                request.addParameter("SpotFleetRequestConfig.Type", StringUtils.fromString(spotFleetRequestConfig.getType()));
            }

            if (spotFleetRequestConfig.getValidFrom() != null) {
                request.addParameter("SpotFleetRequestConfig.ValidFrom", StringUtils.fromDate(spotFleetRequestConfig.getValidFrom()));
            }

            if (spotFleetRequestConfig.getValidUntil() != null) {
                request.addParameter("SpotFleetRequestConfig.ValidUntil", StringUtils.fromDate(spotFleetRequestConfig.getValidUntil()));
            }

            if (spotFleetRequestConfig.getReplaceUnhealthyInstances() != null) {
                request.addParameter("SpotFleetRequestConfig.ReplaceUnhealthyInstances",
                        StringUtils.fromBoolean(spotFleetRequestConfig.getReplaceUnhealthyInstances()));
            }
        }

        return request;
    }

}
